package lk.ijse.javaeeposbackend.bo.custom.impl;

import lk.ijse.javaeeposbackend.bo.custom.CustomerBO;
import lk.ijse.javaeeposbackend.dao.custom.CustomerDAO;
import lk.ijse.javaeeposbackend.dao.DAOFactory;
import lk.ijse.javaeeposbackend.dto.CustomerDTO;

import java.util.List;

public class CustomerBOIMPL implements CustomerBO {
    private final CustomerDAO customerDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.Customer);

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    @Override
    public String saveCustomer(CustomerDTO customer) {
        return customerDAO.saveCustomer(customer);
    }

    @Override
    public boolean updateCustomer(String cusId, CustomerDTO customer) {
        return customerDAO.updateCustomer(cusId, customer);
    }

    @Override
    public CustomerDTO searchCustomer(String cusId ) {
        return customerDAO.searchCustomer(cusId);
    }

    @Override
    public boolean deleteCustomer(String cusId ) {
        return customerDAO.deleteCustomer(cusId);
    }

    @Override
    public List<String> getAppointmentIds() {
        return customerDAO.getAppointmentIds();
    }
}
