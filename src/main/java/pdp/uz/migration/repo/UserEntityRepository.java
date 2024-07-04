//package pdp.uz.migration.repo;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import pdp.uz.migration.entity.UserEntity;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
//    Optional<UserEntity> findById(String email);
//    List<UserEntity> findAll();
//}