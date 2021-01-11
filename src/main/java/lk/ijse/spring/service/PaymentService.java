package lk.ijse.spring.service;

import lk.ijse.spring.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    void addPayment(PaymentDTO dto);
    void updatePayment(PaymentDTO dto);
    void deletePayment(String paymentId);
    PaymentDTO searchPayment(String paymentId);
    List<PaymentDTO> getAllPayments();
}
