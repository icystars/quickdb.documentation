package quickdb.tests.quickdbtesting;

import quickdb.annotations.AnnotationTest;
import quickdb.db.AdminBase;
import quickdb.db.AdminBase.DATABASE;

public class App 
{
    public static void main( String[] args )
    {
        DATABASE db = DATABASE.SQLite;
        String host = "test";
        String port = "";   //3306
        String database = "";   //testQuickDB
        String user = "";   //root
        String pass = "";
        String scheme = "";
        /*AdminBase admin = AdminBase.initialize(db, host,
                port, database, user, pass);*/
        AdminBase admin = AdminBase.initialize(db, host);
        /*AdminBase.initializeAdminBinding(db, host,
                port, database, user, pass, scheme);*/

        //ViewTest test13 = new ViewTest(admin);
        AnnotationTest test1 = new AnnotationTest(admin);
        /*BindingTest test2 = new BindingTest();
        DataStructureTest test3 = new DataStructureTest(admin);
        TestsOperations test4 = new TestsOperations(admin);
        FeaturesTest test5 = new FeaturesTest(admin);
        InvalidTest test6 = new InvalidTest(admin);
        ComplexOperationsTest test7 = new ComplexOperationsTest(admin);
        OperationsTest test8 = new OperationsTest(admin);
        PrimitiveCollectionTest test9 = new PrimitiveCollectionTest(admin);
        QueryTest test10 = new QueryTest(admin);
        ValidationTest test12 = new ValidationTest(admin);*/
        
    }
}
