abstract class MejoraDecorator implements MascotaRobot{
    protected MascotaRobot mascota;

    public MejoraDecorator(MascotaRobot mascota) {
        this.mascota = mascota;
    }
}
