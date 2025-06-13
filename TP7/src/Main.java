public class Main {
    public static void main(String[] args) {
        Admin admin1 = new Admin();
        EmpSalarioFijo empsalfij1 = new EmpSalarioFijo(46520867, "Franco","Mastantuono", 2018);
        EmpSalarioFijo empsalfij2 = new EmpSalarioFijo(43220867, "Enzo","Perez", 2018);
        EmpSalarioFijo empsalfij3 = new EmpSalarioFijo(41520372, "Facundo","Colidio", 2018);
        EmpComision empcom1 = new EmpComision(123456, "Luca","Bertaina",2024,8);
        EmpComision empcom2 = new EmpComision(1234567, "Valentino","Lorca",2024,7);
        EmpComision empcom3 = new EmpComision(12345678, "Jerónimo","Zuñiga",2022,11);
        admin1.agregarEmpleado(empsalfij2);
        admin1.agregarEmpleado(empsalfij3);
        admin1.agregarEmpleado(empcom1);
        admin1.agregarEmpleado(empcom2);
        admin1.agregarEmpleado(empcom3);
        admin1.mostarSalarios();
        admin1.obtenerEmpleadoConMasComisiones();


    }


}