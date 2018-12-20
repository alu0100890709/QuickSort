package Maven1.Quicksort;

public class App 
{
    public static void main( String[] args )
    {
    	int tamano = 5;
		int desordenado[] = new int[tamano];
		int ordenado[] = new int[tamano];

		for(int i = 0; i < tamano; i++) 
			desordenado[i] = (int) (Math.random() * 1000);

		System.out.println("Desordenado");

		for(int i = 0; i < tamano; i++) 
			System.out.println(desordenado[i]);

		QuickSortF quickS = new QuickSortF();
		quickS.sort(desordenado);
		ordenado = quickS.getNumbers();
		
		System.out.println("Ordenado");
		for(int i = 0; i < tamano; i++) 
			System.out.println(ordenado[i]);
    }
}
