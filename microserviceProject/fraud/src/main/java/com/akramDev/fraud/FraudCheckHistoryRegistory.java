package com.akramDev.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRegistory  extends JpaRepository<FraudCheckHistory, Integer> {
}
