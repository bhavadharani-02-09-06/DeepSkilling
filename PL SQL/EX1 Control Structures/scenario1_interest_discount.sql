DECLARE
    CURSOR cust_cursor IS
        SELECT c.CustomerID
        FROM Customers c
        WHERE c.Age > 60;
BEGIN
    FOR cust_rec IN cust_cursor LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust_rec.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rate discount applied successfully.');
END;
/