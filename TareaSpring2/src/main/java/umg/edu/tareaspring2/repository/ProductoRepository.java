package umg.edu.tareaspring2.repository;

import umg.edu.tareaspring2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {}