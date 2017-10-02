/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.guessgame;

import id.co.indocyber.guessgame.model.WordModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author zulfahmi
 */
public final class WordQuestionGenerator {

    public static WordModel[] createQuestion() {
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah di Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung dekat Monas");
        WordModel soal4 = new WordModel("Citos", "Mall di Selatan Jakarta");
        WordModel soal5 = new WordModel("Gandaria City", "Mall anak muda");
        WordModel[] bankSoal = {soal1, soal2, soal3, soal4, soal5};
        return bankSoal;
    }    
    public static List<WordModel> createQuestionInCollection() {
        WordModel soal1 = new WordModel("Pondok Indah", "Daerah di Jakarta Selatan");
        WordModel soal2 = new WordModel("Sudirman", "Jalan utama di Jakarta");
        WordModel soal3 = new WordModel("Tugu Tani", "Patung dekat Monas");
        WordModel soal4 = new WordModel("Citos", "Mall di Selatan Jakarta");
        WordModel soal5 = new WordModel("Gandaria City", "Mall anak muda");
        List<WordModel> bankSoal = new ArrayList<>(); //{soal1, soal2, soal3, soal4, soal5};
        bankSoal.add(soal1);
        bankSoal.add(soal2);
        bankSoal.add(soal3);
        bankSoal.add(soal4);
        bankSoal.add(soal5);
        return bankSoal;
    }
    
    public static List<WordModel> createQuestionFromFile(String filename) throws FileNotFoundException, IOException {
        List<WordModel> bankSoal = new ArrayList<>();
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);        
        String line = null;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            // SPLIT LINE, ASSIGN KE STRING ARRAY
            String[] splitLine = line.split(",");
            // BUAT OBJECT QuestionModel, array idx 0 kata dasar, idx 1 untuk petunjuk
            WordModel wModel = new WordModel(splitLine[0], splitLine[1].trim());
            // add ke questions collection
            bankSoal.add(wModel);
        }               
        
        return bankSoal;
    }
}
