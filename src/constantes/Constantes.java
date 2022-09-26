package constantes;

public class Constantes {

    public enum TiposDeProductos {

        COMIDA,
        BEBIDA
    }

    public enum TiposDeComida {
        DESAYUNO,
        ALMUERZO,
        CENA,
        POSTRE
    }
    public enum TiposDeBebida {
        CERVEZA_INDUSTRIAL,
        CERVEZA_ARTESANAL,
        CAFE_CLASICO,
        CAFE_METODO

    }

    public enum CaracteristicasDeProducto {
        // COMIDA_DESAYUNO
        MEXICANA("Huevo a la mexicana", 60, TiposDeProductos.COMIDA, TiposDeComida.DESAYUNO, 5, "Huevos con jitomate, cebolla y chile"),
        BENEDIGTINOS("Huevos Benedigtinos", 80, TiposDeProductos.COMIDA, TiposDeComida.DESAYUNO, 10, "Dos mitades de panes, cubiertos con pastrami, huevos escalfados y salsa holandesa"),
        PASTOR("Baguette al pastor", 70, TiposDeProductos.COMIDA, TiposDeComida.DESAYUNO, 10, "Baguette con carne al pastor, piña, cebolla, cilantro y pimiento"),
        VEGANO("Baguette Vegano", 60, TiposDeProductos.COMIDA,TiposDeComida.DESAYUNO, 10, "Baguette con semillas, verdura y fermento de col"),

        // COMIDA_POSTRE
        CREME_BRULEE("Crème Brûlée", 50,TiposDeProductos.COMIDA,TiposDeComida.POSTRE, 2, "Crema quemada"),
        PAY("Pay de frutas", 35,TiposDeProductos.COMIDA,TiposDeComida.POSTRE, 2, "Crema quemada"),

        // BEBIDA_FRIA
        CORONA("Corona", 35, TiposDeProductos.BEBIDA, TiposDeBebida.CERVEZA_INDUSTRIAL, 1, "355 ml"),
        VICTORIA("Victoria", 35, TiposDeProductos.BEBIDA, TiposDeBebida.CERVEZA_INDUSTRIAL, 1, "355 ml"),
        LAGRIMAS_NEGRAS("Lagrimas negras", 60, TiposDeProductos.BEBIDA, TiposDeBebida.CERVEZA_ARTESANAL, 1, "Cerveza Stout con notas de chocolate - 355 ml"),
        JABALI_BOCK("Jabali", 50, TiposDeProductos.BEBIDA, TiposDeBebida.CERVEZA_ARTESANAL, 1, "Cerveza Bock con notas a caramelo - 355 ml"),

        // BEBIDA_CALIENTE
        AMERICANO("Americano", 35f, TiposDeProductos.BEBIDA, TiposDeBebida.CAFE_CLASICO, 2, "Cafe espresso con agua caliente"),
        ESPRESSO("Espresso", 35f, TiposDeProductos.BEBIDA, TiposDeBebida.CAFE_CLASICO, 2, "Cafe molido de manera muy fina y muy concentrado"),
        CAPPUCCINO("Capuccino", 35f, TiposDeProductos.BEBIDA, TiposDeBebida.CAFE_CLASICO, 4, "Cafe espresso con leche espumeada"),
        CHEMEX("Chemex", 45f, TiposDeProductos.BEBIDA, TiposDeBebida.CAFE_METODO, 6, "Cafe infusionado y filtrado"),
        COLDBREW("Coldbrew", 50f, TiposDeProductos.BEBIDA, TiposDeBebida.CAFE_METODO, 3, "Cafe infusionado en agua fria por mas de 18 hrs"),
        ARABIC("Arabic", 60f, TiposDeProductos.BEBIDA, TiposDeBebida.CAFE_METODO, 10, "Cafe preparado con el metodos y las especias tradicionales arabes");

        private final String nombre;
        private final float costo;
        private final int tiempoDePreparacion;
        private final TiposDeProductos tipoDeProducto;
        private final TiposDeBebida tipoDeBebida;
        private final TiposDeComida tipoDeComida;
        private final String descripcion;

        // Constructor para bebida
        CaracteristicasDeProducto(String nombre, float costo, TiposDeProductos tipoDeProducto, TiposDeBebida tipoDeBebida, int tiempoDePreparacion, String descripcion) {
            this.nombre = nombre;
            this.costo = costo;
            this.tiempoDePreparacion = tiempoDePreparacion;
            this.tipoDeProducto = tipoDeProducto;
            this.tipoDeBebida = tipoDeBebida;
            this.tipoDeComida = null;
            this.descripcion = descripcion;
        }

        // Costructor para comida
        CaracteristicasDeProducto(String nombre, float costo, TiposDeProductos tipoDeProducto, TiposDeComida tipoDeComida, int tiempoDePreparacion, String descripcion) {
            this.nombre = nombre;
            this.costo = costo;
            this.tipoDeProducto = tipoDeProducto;
            this.tipoDeComida = tipoDeComida;
            this.tipoDeBebida = null;
            this.tiempoDePreparacion = tiempoDePreparacion;
            this.descripcion = descripcion;
        }

        public String getNombre() {
            return nombre;
        }
        public float getCosto() {
            return costo;
        }
        public TiposDeProductos getTipoDeProducto() {
            return tipoDeProducto;
        }
        public TiposDeComida getTipoDeComida() {
            return tipoDeComida;
        }
        public TiposDeBebida getTipoDeBebida() {
            return tipoDeBebida;
        }
        public int getTiempoDePreparacion() {
            return tiempoDePreparacion;
        }
        public String getDescripcion() {
            return descripcion;
        }
    }



    public enum ToppingsBebidas {
        CARDAMOMO,
        MENTA,
        CHOCOLATE
    }

    public enum ToppingsComidas {
        AGUACATE,
        CHIMICHURRI,
        SALSA
    }

    public enum ToppingsPostres {
        CARAMELO,
        CANELA
    }

}
