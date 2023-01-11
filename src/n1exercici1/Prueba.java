package n1exercici1;

class ProductoSinExistenciaException extends Exception {
    public ProductoSinExistenciaException(String mensaje) {
        super(mensaje);
    }
}

class Prueba {

    public static void venderProducto() throws ProductoSinExistenciaException {
        // Aquí el código...
        // Lanzamos una excepción
        throw new ProductoSinExistenciaException("El producto 123 no tiene existencia");
    }

    public static void main(String[] args) {
        try {
            venderProducto();
        } catch (ProductoSinExistenciaException e) {
            // Aquí manejar la excepción
            System.out.println("Se lanzó la excepción");
        }
    }
}