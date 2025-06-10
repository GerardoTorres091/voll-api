package med.voll.api.domain.medico;

import med.voll.api.domain.direccion.DatosDireccion;

public record DatosActualizarMedico(long id, String nombre, String documento, DatosDireccion direccion) {
}
