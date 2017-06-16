package com.alex.solidpresentation.SRP.good_way;

import java.util.List;

/**
 * Created by Alex
 */

public interface IDatabaseManager {

    CustomerModel saveCustomer(int i);

    List<CustomerModel> getAllCustomers();

}
