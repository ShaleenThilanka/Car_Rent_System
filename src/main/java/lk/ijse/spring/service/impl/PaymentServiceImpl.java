package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.repo.PaymentRepo;
import lk.ijse.spring.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addPayment(PaymentDTO dto) {
        if (!repo.existsById(dto.getPaymentId())){
            repo.save(mapper.map(dto, Payment.class));
        }else {
            throw new RuntimeException("Payment Id Already Exist !");
        }
    }

    @Override
    public void updatePayment(PaymentDTO dto) {
        if (!repo.existsById(dto.getPaymentId())) {
            repo.save(mapper.map(dto, Payment.class));
        }else {
            throw new RuntimeException("Payment Id Doesn't Exist !");
        }
    }

    @Override
    public void deletePayment(String paymentId) {
        if (repo.existsById(paymentId)){
            repo.deleteById(paymentId);
        }else {
            throw new RuntimeException("No Payment Id for "+paymentId);
        }
    }

    @Override
    public PaymentDTO searchPayment(String paymentId) {
        Optional<Payment> payment = repo.findById(paymentId);
        if (payment.isPresent()){
            return mapper.map(payment.get(), PaymentDTO.class);
        }else {
            throw new RuntimeException("No Payment id for "+paymentId);
        }
    }

    @Override
    public List<PaymentDTO> getAllPayments() {
        List<Payment> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<PaymentDTO>>(){}.getType());
    }
}
