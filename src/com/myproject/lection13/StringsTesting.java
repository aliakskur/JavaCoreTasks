package com.myproject.lection13;

import com.myproject.lection08.ApplicationLogger;

public class StringsTesting {
    public static void main(String[] args) {
        String str1 = "Change";
        String str2 = " World!";
        String messageToReplaceSubstring = ":( :( :( :(";
        String oldSymbol = ":(";
        String newSymbol = ":)";
        String stringStartEndsEqualWord = "Hey, my name is Alex, Hey";
        String stringStartEndsword = "Hey";
        String messageNew = "";
       /* String strOldSymbol = ":(";
        String strNewSymbol = ":)";*/
        boolean ifStringStartAndFinishWord = false;
        String personNameSurname = "Ivanov aleksandr Ivanovich Balishev";
        String removeDuplicates = "AAAbbbbbcdddddgggg";
        String personFIO = "";
        int countWordsInString;

        //  int numberOfIteration = 1000000000; // java.lang.OutOfMemoryError Exception
        int numberOfIteration = 100000;
        Appendable resultConcatVSStringBuilderTest;

        resultConcatVSStringBuilderTest = UtilsString.stringBuilderVSString(str1, str2, numberOfIteration);
        ApplicationLogger.LOGGER.info(resultConcatVSStringBuilderTest);


        messageNew = UtilsString.strReplace(messageToReplaceSubstring, oldSymbol, newSymbol);
        ApplicationLogger.LOGGER.info("I was sad " + messageToReplaceSubstring + " but now I am happy " + messageNew);

        ifStringStartAndFinishWord = UtilsString.ifStringStartAndFinishWord(stringStartEndsEqualWord, stringStartEndsword);
        ApplicationLogger.LOGGER.info("Sentence \" " + stringStartEndsEqualWord + " \" starts and finish with word \" " +
                stringStartEndsword + " \" ? : " + ifStringStartAndFinishWord);

      UtilsString.personFIOreturn(personNameSurname);

      personFIO = UtilsString.personFIOreturn(personNameSurname);
        ApplicationLogger.LOGGER.info("First name, Second name, Father's name ( " +
                personNameSurname + " )" + " initials: " + personFIO);

        countWordsInString = UtilsString.countWordsInString(personNameSurname);
          ApplicationLogger.LOGGER.info("Inside sentence \"" +  personNameSurname +" \" " + countWordsInString + " words");

        UtilsString.removeDuplicate(removeDuplicates);

    }
}

