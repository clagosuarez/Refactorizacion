package factorial;

/**
 *
 * @author 
 */
public class numeros {

    /**
     * @param args the command line arguments
     * arg[0] es el primer parámetro que se le pasa cuando se ejecuta por linea de comandos
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.

    public static boolean primo = false;
    

    public static void main(String arg[]) {
        int numeroDigitosCorrecto=0;
        int numerodigitos=0;
        numeroDigitosCorrecto=Integer.parseInt(arg[0]);
        if(numeroDigitosCorrecto<=0)
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        for(int contador = 1; contador <= 99999; contador++ )
        {
        int dividir = contador;
        int a=0;

        while (dividir != 0)
        {dividir = dividir / 10;
            a++;
        }
        numerodigitos=a;


        if(numerodigitos==numeroDigitosCorrecto){
            if (contador < 4) primo = true;
            else
            {
                if (contador % 2 == 0) primo = false;
                else { int uno = 0;
                        int iele = 1;int ele = (contador - 1) / 2;if  (ele % 2 == 0) ele--;
                        while(iele <= ele) { if (contador % iele == 0) uno++;
        iele += 2;
        if (uno == 2) iele = ele + 1;
                        }

                        if (uno == 1) primo = true; } }

                if (primo == true)
                    System.out.println(contador);
        } } }}
 