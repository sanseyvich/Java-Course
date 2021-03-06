package ua.artcode.basic.week3.homework;

/**
 * Created by olsas on 3/17/2016.
 * <p>
 * Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
 *
 * треба вирішити по-людськи
 */
public class ChainOfElementsIdentifier {
    public static void zeroAndOneChainIdentify(int number) {
        char[] charArr = (number + "").toCharArray();
        int zeroMaxAm = 0;
        int oneMaxAm = 0;
        int tempZero = 0;
        int tempOne = 0;
        int maxIndexZero = 0;
        int maxIndexOne = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '0') {
                tempZero++;
            } else {
                if (tempZero > zeroMaxAm){
                    zeroMaxAm = tempZero;
                    maxIndexZero = i;
                }
                tempZero = 0;
            }
            if (charArr[i] == '1') {
                tempOne++;

            } else {
                if (tempOne > oneMaxAm){
                    oneMaxAm = tempOne;
                    maxIndexOne = i;
                }
                tempOne = 0;
            }
        }
        System.out.println("Zeros " + (maxIndexZero - zeroMaxAm) + "," + maxIndexZero);
        System.out.println("Ones " + (maxIndexOne - oneMaxAm) + "," + maxIndexOne);
    }

    public static void main(String[] args) {
        zeroAndOneChainIdentify(312001011);
    }
}
