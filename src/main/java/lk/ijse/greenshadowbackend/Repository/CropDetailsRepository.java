package lk.ijse.greenshadowbackend.Repository;

import lk.ijse.greenshadowbackend.entity.CropDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CropDetailsRepository extends JpaRepository<CropDetails, String> {
    boolean existsByLogCode(String logCode);
    Optional<CropDetails> findCropDetailsByLogCode(String logCode);
}
