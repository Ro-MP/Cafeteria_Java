package constantes;

public class Constantes {

    public enum TiposDeProductos {
        CAFE,
        COMIDA
    }

    public enum TiposDeCafe {
        CAFE_CLASICO,
        CAFE_METODO
    }

    public enum CaracteristicasDeCafe {
        AMERICANO(35f, 2, TiposDeProductos.CAFE, "Cafe espresso con agua caliente", 200, TiposDeCafe.CAFE_CLASICO),
        ESPRESSO(35f, 2, TiposDeProductos.CAFE, "Cafe molido de manera muy fina y muy concentrado", 60, TiposDeCafe.CAFE_CLASICO),
        CAPPUCCINO(35f, 4, TiposDeProductos.CAFE, "Cafe espresso con leche espumeada", 350, TiposDeCafe.CAFE_CLASICO),
        CHEMEX(45f, 6, TiposDeProductos.CAFE, "Cafe infusionado y filtrado", 250, TiposDeCafe.CAFE_METODO),
        COLDBREW(50f, 3, TiposDeProductos.CAFE, "Cafe infusionado en agua fria por mas de 18 hrs", 200, TiposDeCafe.CAFE_METODO),
        ARABIC(60f, 10, TiposDeProductos.CAFE, "Cafe preparado con el metodos y las especias tradicionales arabes", 300, TiposDeCafe.CAFE_METODO);

        private final float costo;
        private final int tiempoDePreparacion;
        private final TiposDeProductos tipoDeProducto;
        private final String descripcion;
        private final int tamañoDeTaza;
        private final TiposDeCafe tipoDeCafe;

        CaracteristicasDeCafe(float costo, int tiempoDePreparacion, TiposDeProductos tipoDeProducto, String descripcion, int tamañoDeTaza, TiposDeCafe tipoDeCafe) {
            this.costo = costo;
            this.tiempoDePreparacion = tiempoDePreparacion;
            this.tipoDeProducto = tipoDeProducto;
            this.descripcion = descripcion;
            this.tamañoDeTaza = tamañoDeTaza;
            this.tipoDeCafe = tipoDeCafe;
        }

        public float getCosto() {
            return costo;
        }

        public int getTiempoDePreparacion() {
            return tiempoDePreparacion;
        }

        public TiposDeProductos getTipoDeProducto() {
            return tipoDeProducto;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getTamañoDeTaza() {
            return tamañoDeTaza;
        }

        public TiposDeCafe getTipoDeCafe() {
            return tipoDeCafe;
        }
    }



    public enum TiposDeComida {
        POSTRE,
        BAGUETTE
    }

    public enum TiposDePostres {
        PASTEL,
        PAY,
        GALLETAS
    }

    public enum TiposDeBaguette {
        VEGANO,
        PASTOR,
        QUESOS
    }

    public enum ToppingsBebidas {
        CARDAMOMO,
        MENTA,
        CHOCOLATE
    }

    public enum ToppingsComida {
        AGUACATE,
        CHIMICHURRI,
        SALSA
    }

}
