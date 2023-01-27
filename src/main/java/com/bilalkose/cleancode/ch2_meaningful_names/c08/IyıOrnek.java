package main.java.com.bilalkose.cleancode.ch2_meaningful_names.c08;

public class IyıOrnek {

    public class GuessStatisticsMessage {

        private String number;
        private String verb;
        private String pluralModifier;

        public String make(char candidate, int count) {
            createPluralDependentMessageParts(count);
            return String.format(
                    "There %s %s %s%s",
                    verb, number, candidate, pluralModifier );
        }

        private void createPluralDependentMessageParts(int count) {
            if (count == 0) {
                thereAreNoLetters(); //anlaşılabilir bir isimlendirme
            } else if (count == 1) {
                thereIsOneLetter(); //anlaşılabilir bir isimlendirme
            } else {
                thereAreManyLetters(count); //anlaşılabilir bir isimlendirme
            }
        }

        private void thereAreManyLetters(int count) {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }

        private void thereIsOneLetter() {
            number = "1";
            verb = "is";
            pluralModifier = "";
        }

        private void thereAreNoLetters() {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        }
    }

}
