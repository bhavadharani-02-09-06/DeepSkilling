DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000;
BEGIN
    FOR cust_rec IN cust_cursor LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust_rec.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/