package com.alex.solidpresentation.SRP.solution;

import java.util.List;

/**
 * Created by Alex
 */

public interface IDatabaseManager {

    CustomerModel saveCustomer(int i);

    List<CustomerModel> getAllCustomers();

}
