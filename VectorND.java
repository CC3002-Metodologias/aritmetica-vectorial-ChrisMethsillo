public class VectorND { 
  //Clase VectorND(array):Se define una n-tupla de numeros reales

  protected double[] array;

  public VectorND(double[] array) {
  //Recibe el array de tamaño n.
    this.array=array;
  }

  public VectorND add(VectorND v2) {

  /*method .add(VectorND):VectorND->VectorND
  Suma las coordenadas de dos Vectores de tamaño n.*/

    double[] sumArray;
    VectorND result;

    if (this.array.length>=v2.array.length) {//Caso 1: largo v1>= largo v2
      sumArray=new double[this.array.length];

      for(int i=0;i<v2.array.length;i++) {
        sumArray[i]=this.array[i]+v2.array[i];
      }
      for(int i=v2.array.length;i<this.array.length;i++) {//Si largo v1>largo v2, para los elementos a partir de la posicion i=v2.length para el vector v1 se les suma 0

        sumArray[i]=this.array[i];
      }
      result=new VectorND(sumArray);
    }

    else{//Caso 2: largo v1<largo v2
      sumArray=new double[v2.array.length];
      for(int i=0; i<this.array.length;i++) {
        sumArray[i]=this.array[i]+v2.array[i];
      }
      for(int i=this.array.length;i<v2.array.length;i++) {//Para los elementos a partir de la posicion i=v1.length para el vector v2 se les suma 0
        sumArray[i]=v2.array[i];
      }
      result=new VectorND(sumArray);
    }
    return result;
  }
  
  public double getLength(){
  /*method .getLength():None->double
  Calcula la norma de una clase VectorND */
    double sumSq=0;
    for(int i=0; i<this.array.length; i++){
      sumSq+=Math.pow(this.array[i],2);//suma de los cuadrados de las coordenadas
    }
    return Math.sqrt(sumSq);//Calculo de la raiz de la suma de los cuadrados.
  }

  public boolean isZeroVector(){
  /*method .isZeroVector():None->boolean
  Comprueba si un elemento de clase VectorND es un vector nulo. Retorna un boolean.*/

    for(int i=0; i<this.array.length;i++){
      if(this.array[i]!=0){return false;}
    }
    return true;
  }

  public boolean isOppositeTo(VectorND v2){
  /*method .isOppsiteTo(VectorND):VectorND->boolean
 Comprueba si dos vectores a,b cumplen que a=-b (Sean opuestos).*/

    VectorND sum=this.add(v2);
    boolean result=sum.isZeroVector();//Propiedad: si a=-b, a+b=0 (Vector nulo)
    return result;
  }
  
  public double dotProduct(VectorND v2){
  /*method .dotProduct(VectorND):VectorND->double
  Calcula el producto punto entre dos vectores.*/
    double result=0;

    if(this.array.length<=v2.array.length){//Caso 1: largo v1<=v2
      for(int i=0;i<this.array.length;i++){
        result+=this.array[i]*v2.array[i];
      }
    }
    else{//Caso 1: largo v1>v2
      for(int i=0;i<v2.array.length;i++){
        result+=this.array[i]*v2.array[i];
      }
    }
    return result;
  }

  public void printVector(){
    /*method printVector():None->None
    Imprime las coordenadas de un VectorND*/
    String a="";
    for(int i=0; i<this.array.length; i++){
      a+=this.array[i];
      if(i<this.array.length-1){
        a+=", ";
      } 
    }
    System.out.print("("+a+")");
  }

}