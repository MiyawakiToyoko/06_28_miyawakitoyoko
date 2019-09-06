package com.company.ColLesson03;

import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        Word[] word = new Word[5];

        System.out.println("わからなかった単語とその意味をスペースを区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

//        String input = "";
        int i = 0;
        try {//例外処理
            while (!input.equals("e")) {//ループはwhile文を使用 eが入力されるまで繰り返す
//            Scanner sc = new Scanner(System.in);
//            input = sc.nextLine();
//            ↑ 1度目の入力からループ内に記述したら、存在しない配列にアクセスしているというエラーが発生。inputの初期値を""にしたことが原因？？

                if (input.contains(" ") || input.contains("　")) {//入力された文字がスペースを含んでいるかで条件分岐する
                    String[] arr = input.split("[ 　]");//スペースで区切ってarr[0]、arr[1]に格納 スペースは半角でも全角でもok
                    Word entry = new Word(arr[0], arr[1]); //インスタンス生成
                    word[i] = entry;
                    System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
                    input = sc.nextLine();
                    i++;
                } else {//スペースが入っていないと文字列を区切れないので再入力
                    System.out.println("※再入力！単語と意味をスペースで区切って入力して下さい。");
                    input = sc.nextLine();
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
        }

        for(int j = 0; j < i; j++){
            System.out.println(word[j]); //toString()メソッドで出力
        }

        System.out.println(i + "件 登録しました。");

    }
}