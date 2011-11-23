package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TPCW_DatabaseTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAddOrderLine(java.sql.Connection con, int ol_id, int ol_o_id, int ol_i_id, int ol_qty, double ol_discount, java.lang.String ol_comment) {
		fail("Not yet implemented");
	}

	@Test
	public void testAdminUpdate(int i_id, double cost, java.lang.String image, java.lang.String thumbnail) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testClearCart(java.sql.Connection con, int shopping_id) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCreateEmptyCart()  {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCreateNewCustomer(Customer cust) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDoAuthorSearch(java.lang.String search_key) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDoBuyConfirm(int shopping_id, int customer_id, java.lang.String cc_type, long cc_number, java.lang.String cc_name, java.sql.Date cc_expiry, java.lang.String shipping) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDoBuyConfirm(int shopping_id, int customer_id, java.lang.String cc_type, long cc_number, java.lang.String cc_name, java.sql.Date cc_expiry, java.lang.String shipping, java.lang.String street_1, java.lang.String street_2, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String country)  {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDoCart(int SHOPPING_ID, java.lang.Integer I_ID, java.util.Vector ids, java.util.Vector quantities)  {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDoSubjectSearch(java.lang.String search_key) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDoTitleSearch(java.lang.String search_key) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEnterAddress(java.sql.Connection con, java.lang.String street1, java.lang.String street2, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String country) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEnterCCXact(java.sql.Connection con, int o_id, java.lang.String cc_type, long cc_number, java.lang.String cc_name, java.sql.Date cc_expiry, double total, int ship_addr_id) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testEnterOrder(java.sql.Connection con, int customer_id, Cart cart, int ship_addr_id, java.lang.String shipping, double c_discount) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetBestSellers(java.lang.String subject) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetBook(int i_id) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetCAddr(java.sql.Connection con, int c_id) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetCAddrID(java.sql.Connection con, int c_id) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetCart(int SHOPPING_ID, double c_discount) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetCDiscount(java.sql.Connection con, int c_id) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetConnection() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetCustomer(java.lang.String UNAME) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetMostRecentOrder(java.lang.String c_uname, java.util.Vector order_lines) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetName(int c_id) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetNewConnection() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetNewProducts(java.lang.String subject) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetPassword(java.lang.String C_UNAME) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetRelated(int i_id, java.util.Vector i_id_vec, java.util.Vector i_thumbnail_vec) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetStock(java.sql.Connection con, int i_id) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetUserName(int C_ID) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRefreshSession(int C_ID) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testReturnConnection(java.sql.Connection con) {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetStock(java.sql.Connection con, int i_id, int new_stock) {
		fail("Not yet implemented");
	}

	@Test
	public void testVerifyDBConsistency() {
		fail("Not yet implemented");
	}

}
