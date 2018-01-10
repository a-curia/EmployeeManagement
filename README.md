Employee Management Application
-------------------------------

Scope of the project:

Technology Stack

SpringBoot 2.0M7

-   MySQL

-   ReactJs &Redux

 

Details about used modules:

-   JdbcTemplate query() methods are used

 

-   **Query for Single Row** - there are 2 ways to query or extract a single row
    from database, and convert it into a model class

    -   **RowMapper** - create a custom RowMapper to suit your needs, and pass
        the custom  RowMapper to queryForObject() method, the returned result
        will call your custom mapRow() methodto match the value into the
        property

    -   **BeanPropertyRowMapper** - can map a row’s column value to a property
        by matching their names

    -   **make sure both the property and column have the same name**(eg.
        property ‘custId’ will match to column name CUSTID or with underscores
        CUST_ID)

     

-   **Query for Multiple Rows** - we will query or extract multiple rows from
    database, and convert it into a List

    -   **Map is Manually** - *RowMapper is not supported in queryForList()
        method*, so you need to map it manually

        -   **BeanPropertyRowMapper** - this is the best solution in this case

         

-   **Querying for a Single Value** - how to query or extract a single column
    value from database

    -   **Single Column Name**

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public String findCustomerNameById(int custId){

    String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";

    String name = (String)getJdbcTemplate().queryForObject(
            sql, new Object[] { custId }, String.class);

    return name;

}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

-   **Total Number of Rows**

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public int findTotalCustomer(){

    String sql = "SELECT COUNT(*) FROM CUSTOMER";

    int total = getJdbcTemplate().queryForInt(sql);

    return total;
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
