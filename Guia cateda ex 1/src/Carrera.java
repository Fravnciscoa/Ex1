public class Carrera {
    private int identificador;
    private String nombre;
    private String areaSaber;
    private ArrayList alumnos;

    public boolean agregarAlumno(Alumno alumno){
        for (int i = 0; i < alumnos.size(); i++){
            Alumno a = (Alumno)alumnos.get(i);
            if(a.equals(alumno)){
                alumnos.add(alumno);
                return true;
            }
        }
        return false;
    }

    public Alumno obtenerAlumno(int rol){
        for (int i = 0; i < alumnos.size(); i++){
            if(alumnos.get(i).equals(rol)){
                return (Alumno)alumnos.get(i);
            }
        }
        return null;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaSaber() {
        return areaSaber;
    }

    public void setAreaSaber(String areaSaber) {
        this.areaSaber = areaSaber;
    }

    public ArrayList getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList alumnos) {
        this.alumnos = alumnos;
    }
}
