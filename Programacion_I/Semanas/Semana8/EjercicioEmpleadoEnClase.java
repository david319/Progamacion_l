package Semana8;

public class EjercicioEmpleadoEnClase {
    // Atributos
    private String nombreEmpresa;
    private int contador;
    private Empleados listaEmp[];

    // Constructor
    public EjercicioEmpleadoEnClase(String nombreE, int cantidadEmpleado) {
        this.nombreEmpresa = nombreE;
        listaEmp = new Empleados[contador];
    }

    // Función buscar empleado
    public Empleados buscar(int codigo) {
        for (Empleados emp : listaEmp) {
            if (emp != null && emp.getCodigo() == codigo) {
                return emp;
            }
        }
        return null;
    }
    // Agregar empleado
    public boolean agregarV1(int code, String name) {
        if (buscar(code) == null) {
            for (int i = 0; i < listaEmp.length; i++) {
                if (listaEmp[i] == null) {
                    listaEmp[i] = new Empleados(code, name);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean agregarV2(int code, String name) {
        if (buscar(code) == null) {
            if (listaEmp[contador] == null) {
                listaEmp[contador] = new Empleados(code, name);
                contador++;
                return true;
            }
        }
        return false;
    }

    public void imprimirEmpleado(){
        for (Empleados emp : listaEmp){
            if(emp != null){
                emp.imprimir();
            }
        }
    }

    public float pagarEmpleado(int codigo){
        Empleados emp = buscar(codigo);
        if(emp != null){
            return emp.pagar();
        }
        return -1;
    }
}
