public class Main {
    public static void main(String[] args) {
        MascotaRobot mascota = new RobotPet("Spyke");

        // Se combinan las mejoras libremente envolviendo la mascota.
        mascota = new AlasHolograficas(mascota);
        mascota = new ArmaduraInteligente(mascota);
        mascota = new CanonLaser(mascota);
        mascota = new EscudoEnergia(mascota);

        mostrarCaracteristicas(mascota);
    }

    public static void mostrarCaracteristicas(MascotaRobot mascota) {
        System.out.println("Descripcion: " + mascota.descripcion());
        System.out.println("Energia: " + mascota.energia());
        System.out.println("Poder: " + mascota.poder());
    }
}
