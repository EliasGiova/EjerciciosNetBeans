
package com.egg.biblioteca.repositorios;

import com.egg.biblioteca.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/*Esta capa se encarga de proveer un
API simple de usar, orientado al negocio, sin exponer complejidades propias de un repositorio de datos.
En esta capa se resuelven:
• cualquier acceso a la base de datos
• cualquier acceso a filesystem
• cualquier acceso a otros sistemas
• cualquier acceso a un repositorio de datos en cualquier forma.*/
public interface EditorialRepositorio extends JpaRepository<Editorial, String> {
    
}
