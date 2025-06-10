package med.voll.api.domain.paciente;

import med.voll.api.domain.medico.Medico;

public record DatosListadoPaciente(Long id, String nombre, String documento, String email) {

    public DatosListadoPaciente(Paciente paciente){
        this(paciente.getId(),paciente.getNombre(), paciente.getDocumento(), paciente.getEmail());
    }

}