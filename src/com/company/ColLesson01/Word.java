package com.company.ColLesson01;

public class Word {
    //フィールド　＝　オブジェクトが持つデータ
    public String word;
    public String meaning;

    //引数ありコンストラクタ
    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    //メソッド = オブジェクトのふるまい
    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

}
