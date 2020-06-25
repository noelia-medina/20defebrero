import java.util.Scanner;
public class metododelaburbuja 
{
	public static void main(String[]arg)
	{
		int n,i,j,aux;
		System.out.println("\t VECTOR A");
		System.out.println(" ingrese la cantidad de numeros a ordenar:");
		
		Scanner leer=new Scanner (System.in);
		n=leer.nextInt();
		System.out.println("\t DATOS");
		int v[]=new int [n];
		for (i=0;i<n;i++)
		{
			System.out.println("INGRESE EL DATO:");
			System.out.println("DATO"+(i+1)+"=");
			v[i]=leer.nextInt();
		}
		for (i=0;i<n;i++)
	    {
		 for (j=i+1;j<n;j++)
		    {
			 if (v[i]>v[j])
			 {
			   aux=v[i];
			   v[i]=v[j];
			   v[j]=aux;
			 }
			 
		   }
		 
	    }
	for (i=0;i<n;i++)
    {
		System.out.println("el orden es:"+v[i]);
		
    }
	System.out.println("BUSQUEDA DENTRO DEL VECTOR:");
	}
	
}
