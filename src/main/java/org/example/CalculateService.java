package org.example;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class CalculateService {
    public Double getPayment(double salary, int days) {
        return salary/29.3 * days;

    }
}

