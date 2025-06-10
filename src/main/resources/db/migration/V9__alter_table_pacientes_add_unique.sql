ALTER TABLE pacientes
ADD CONSTRAINT uq_pacientes_email UNIQUE (email),
ADD CONSTRAINT uq_pacientes_documento UNIQUE (documento);