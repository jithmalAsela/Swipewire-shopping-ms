package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Bufcart;

@Repository
@Transactional
public interface CartRepository extends JpaRepository<Bufcart, Long> {

	List<Bufcart> findByEmail(String email);

	List<Bufcart> findByEmailAndIsPlaceOrder(String email,String isPlaceOrder);

	Bufcart findByBufcartIdAndEmail(int bufcartId, String email);

	void deleteByBufcartIdAndEmail(int bufcartId, String email);

	List<Bufcart> findAllByEmail(String email);

	List<Bufcart> findAllByOrderId(int orderId);
}
