package unidades.unidad6.tareas.piezasYProveedores;
class DatosProveedores {
    public static Proveedores[] obtenerProveedores() {
        Proveedores[] proveedores = new Proveedores[10];
        proveedores[0] = new Proveedores(1, "Acero y Cía");
        proveedores[1] = new Proveedores(2, "Herramientas del Norte");
        proveedores[2] = new Proveedores(3, "Materiales Universal");
        proveedores[3] = new Proveedores(4, "Construcciones Omega");
        proveedores[4] = new Proveedores(5, "Industrias Beta");
        proveedores[5] = new Proveedores(6, "Tornillos y Más");
        proveedores[6] = new Proveedores(7, "Proveedora del Sur");
        proveedores[7] = new Proveedores(8, "Suministros Alfa");
        proveedores[8] = new Proveedores(9, "Equipos y Partes");
        proveedores[9] = new Proveedores(10, "Metales del Este");
        return proveedores;
    }
}