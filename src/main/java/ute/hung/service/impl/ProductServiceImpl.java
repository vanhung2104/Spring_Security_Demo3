package ute.hung.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ute.hung.entity.Product;
import ute.hung.repository.ProductRepository;
import ute.hung.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;
    public ProductServiceImpl (ProductRepository repo) { this.repo = repo; }
    @Override
    public List<Product> listAll() { return repo.findAll(); }
    @Override
    public Product save (Product product) { return repo.save(product); }
    @Override
    public Product get (Long id) { return repo.findById(id).get(); }
    @Override
    public void delete (Long id) { repo.deleteById(id); }
}
