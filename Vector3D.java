public class Vector3D extends VectorND{//Clase Vector3D: Se define el vector de 3 dimensiones
    
    public Vector3D(double x, double y, double z){
    //Recibe 3 argumentos del tipo double. Se definen las coordenadas x, y ,z.
        super(new double[]{x, y, z});
    }
    
    public Vector3D crossProduct(Vector3D v2){
    //method crossProduct():Vector3D->Vector3D
    //Se calcula el producto cruz entre dos vectores de dimension 3.
        double[] units = new double[3];
        units[0] = (this.array[1] * v2.array[2] - this.array[2] * v2.array[1]);
        units[1] = (this.array[2] * v2.array[0] - this.array[0] * v2.array[2]);
        units[2] = (this.array[0] * v2.array[1] - this.array[1] * v2.array[0]);
        Vector3D result = new Vector3D(units[0], units[1], units[2]); 
        return result;
    }

}
