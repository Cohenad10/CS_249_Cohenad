package edu.cohenad.assign03;

public class Letterhead {
        private String name;
        private String[] sloganLines;
        private char boundaryChar;

        public Letterhead(String name, String[] sloganLines, char boundaryChar) {
            this.name = name;
            this.boundaryChar = boundaryChar;
            setSlogan(sloganLines);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public char getBoundaryChar() {
            return boundaryChar;
        }

        public void setBoundaryChar(char boundaryChar) {
            this.boundaryChar = boundaryChar;
        }

        public String getSlogan() {
            StringBuilder sb = new StringBuilder();
            for (String line : sloganLines) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        }

        public void setSlogan(String[] sloganLines) {
            if (sloganLines == null) {
                this.sloganLines = new String[0];
            } else {
                this.sloganLines = new String[sloganLines.length];
                for (int i = 0; i < sloganLines.length; i++) {
                    this.sloganLines[i] = sloganLines[i];
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int maxLineLength = 40 - 2;
            // top boundary line
            sb.append(String.format("%c%s%c\n", boundaryChar, repeatChar(maxLineLength, boundaryChar), boundaryChar));
            // business name line
            sb.append(String.format("%c %s%s %c\n", boundaryChar, name, repeatChar(maxLineLength - name.length() - 2, ' '), boundaryChar));
            // blank line
            sb.append(String.format("%c%s%c\n", boundaryChar, repeatChar(maxLineLength, ' '), boundaryChar));
            // slogan lines
            for (String line : sloganLines) {
                sb.append(String.format("%c %s%s %c\n", boundaryChar, line, repeatChar(maxLineLength - line.length() - 2, ' '), boundaryChar));
            }
            // blank lines to make the total height 8
            int numBlankLines = 8 - 4 - sloganLines.length;
            for (int i = 0; i < numBlankLines; i++) {
                sb.append(String.format("%c%s%c\n", boundaryChar, repeatChar(maxLineLength, ' '), boundaryChar));
            }
            // bottom boundary line
            sb.append(String.format("%c%s%c\n", boundaryChar, repeatChar(maxLineLength, boundaryChar), boundaryChar));
            return sb.toString();
        }

        private static String repeatChar(int num, char c) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num; i++) {
                sb.append(c);
            }
            return sb.toString();
        }
    }


