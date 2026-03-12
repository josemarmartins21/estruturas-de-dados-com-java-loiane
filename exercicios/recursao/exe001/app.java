
class app 
{
    public static void main(String[] args) {
        int[] v = {
            12,
            2,
            5,

        };

        System.out.println(soma(v, 0));



    }

    public static int soma(int v[], int pos) {
        int soma = 0;
        if (v.length > pos) {
            soma = v[pos] + soma(v, pos + 1);
        }
        return soma;
    }
}