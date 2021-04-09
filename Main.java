public class Main{
    public static void main(String[] args){
      //Testeamos la suma y la creacion de vectores 2D, 3D y ND
        Vector2D v1 = new Vector2D(1,2); // Se crea un Vector2D
        Vector3D v2 = new Vector3D(-1, 0, 1); // Se crea un Vector3D
        VectorND v3 = v1.add(v2); // Se suma v1 y v2 
   
        System.out.println("TEST add");
        System.out.print("Suma vectores Vector2D");
        v1.printVector();
        System.out.print("+ Vector3D");
        v2.printVector();
        System.out.print("\nResultado: VectorND");
        v3.printVector();

      //Testeamos el calculo de la norma de un Vector
        VectorND v4=new VectorND(new double[]{1,2,3,4,5});//Se crea un VectorND
        System.out.println("\n \nTEST getLength");
        System.out.print("Definimos v4=VectorND");
        v4.printVector();
        System.out.println("\nLa norma es: "+v4.getLength()+"\n");
        
        Vector2D v5=new Vector2D(3,4);//Se crea un Vector2D
        System.out.print("Definimos v5=Vector2D");
        v5.printVector();
        System.out.println("\nLa norma es: "+v5.getLength());

      //Testeamos la clase ZeroVector y el metodo isZeroVector
        ZeroVector v6=new ZeroVector();
        VectorND v7=new VectorND(new double[] {0,0,0,0});
        VectorND v8=new VectorND(new double[] {1,2,3,0,5});
        System.out.println("\n TEST ZeroVector and isZeroVector");
        System.out.print("Definimos: \n v6=ZeroVector\n v7=VectorND");
        v7.printVector();
        System.out.print("\n v8=VectorND");
        v8.printVector();
        System.out.print("\n\nComprobamos: \n v6.isZeroVector="+v6.isZeroVector()+"\n v7.isZeroVector="+v7.isZeroVector()+"\n v8.isZeroVector="+v8.isZeroVector());
      
      //Testeamos el metodo isOppositeTo
        VectorND v9=new VectorND(new double[]{1,2,3,4,5});
        VectorND v10=new VectorND(new double[]{-1,-2,-3,-4,-5});
        VectorND v11=new VectorND(new double[]{8,4,0,2,1});
        System.out.println("\n \nTEST isOppositeTo");
        System.out.print("Definimos: \n v9=VectorND");
        v9.printVector();
        System.out.print("\n v10=VectorND");
        v10.printVector();
        System.out.print("\n v11=VectorND");
        v11.printVector();
        System.out.print("\n\nComprobamos: \n v9.isOppositeTo(v10)="+v9.isOppositeTo(v10)+"\n v9.isOppositeTo(v11)="+v9.isOppositeTo(v11));

      //Testeamos el metodo dotProduct
        System.out.println("\n \nTEST dotProduct");
        System.out.print("Definimos: \n v9=VectorND");
        v9.printVector();
        System.out.print("\n v11=VectorND");
        v11.printVector();
        System.out.println("v9.dotProduct(v11)="+v9.dotProduct(v11));

      //Testeamos el metodo crossProduct
        Vector3D a=new Vector3D(1, 2, 3);
        Vector3D b=new Vector3D(2, 4, 8);
        Vector3D axb=a.crossProduct(b);
        System.out.println("\n \nTEST crossProduct");
        System.out.print("Definimos: \n a=Vector3D");
        a.printVector();
        System.out.print("\n b=Vector3D");
        b.printVector();
        System.out.print("\n Vector3D axb=");
        axb.printVector();
        System.out.println("\n");
  }
}