public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        int count = 0;
        bucle1:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    continue;
                }
                ++count;
                System.out.println(count + ".- " + "i , j = " + i + " , " + j );


            }

        }
    }
}
