public class Universidad {
    private ListCollection carreras;

    public Universidad(){
        carreras = new ListCollection();
    }

    public boolean agregarCarrera(Carrera carrera){
        carreras.setFirst();

        while(!carreras.eol()){
            Carrera c = (Carrera) carreras.currValue();
            if (c.getIdentificador() == carrera.getIdentificador()){
                return false;
            }
            carreras.next();
        }
        carreras.append(carrera);
        return true;
    }

    public boolean agregarAlumno(int idCarrera, Alumno alumno){
        carreras.setFirst();

        while (!carreras.eol())
        {
            Carrera c = (Carrera) carreras.currValue();
            if (c.getIdentificador() == idCarrera)
            {
                c.agregarAlumno(alumno);
                return true;
            }
            carreras.next();
        }
        return false;
    }
    public Alumno obtenerAlumno(int rut) {
        carreras.setFirst();

        // Recorremos todas las carreras para buscar al alumno
        while (!carreras.eol()) {
            Carrera c = (Carrera) carreras.currValue();
            Alumno alumno = c.obtenerAlumno(rut);
            if (alumno != null) {
                return alumno; // Retornamos el alumno si lo encontramos
            }
            carreras.next();
        }

        return null; // No se encontró al alumno
    }

}
