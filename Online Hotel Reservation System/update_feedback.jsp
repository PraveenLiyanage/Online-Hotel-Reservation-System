<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>CEYLON HOTEL RESERVATION</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@400;700&family=Roboto:wght@400;700&display=swap" rel="stylesheet">  

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Topbar Start -->
    <div class="container-fluid bg-primary d-none d-lg-block">
        <div class="container">
            <div class="row">
                <div class="col-md-6 text-center text-lg-start mb-2 mb-lg-0">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-dark py-2 pe-3 border-end border-white" href=""><i class="bi bi-telephone text-secondary me-2"></i>+012 345 6789</a>
                        <a class="text-dark py-2 px-3" href=""><i class="bi bi-envelope text-secondary me-2"></i>CEYLON@gmail.com</a>
                    </div>
                </div>
                <div class="col-md-6 text-center text-lg-end">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-body py-2 px-3 border-end border-white" href="">
                            <i class="fab fa-facebook-f text-secondary"></i>
                        </a>
                        <a class="text-body py-2 px-3 border-end border-white" href="">
                            <i class="fab fa-twitter text-secondary"></i>
                        </a>
                        <a class="text-body py-2 px-3 border-end border-white" href="">
                            <i class="fab fa-linkedin-in text-secondary"></i>
                        </a>
                        <a class="text-body py-2 px-3 border-end border-white" href="">
                            <i class="fab fa-instagram text-secondary"></i>
                        </a>
                        <a class="text-body py-2 ps-3" href="">
                            <i class="fab fa-youtube text-secondary"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Topbar End -->



    <!-- Navbar Start -->
    <nav class="navbar navbar-expand-lg bg-dark navbar-dark shadow-sm px-5 py-3 py-lg-0">
        <a href="index.html" class="navbar-brand p-0">
            <h1 class="m-0 text-uppercase text-primary"></i>CEYLON HOTEL RESERVATION</h1>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav ms-auto py-0 pe-4 border-end border-5 border-primary">
                <a href="home.jsp" class="nav-item nav-link active">Home</a>
                               
                
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">BOOKING</a>
                    <div class="dropdown-menu m-0">
                        <a href="add_booking.jsp" class="dropdown-item"> Add Booking </a>
                        <a href="search_booking.jsp" class="dropdown-item">Manage booking</a>
                       
                    </div>
                </div>
                 <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">FEEDBACK</a>
                    <div class="dropdown-menu m-0">
                        <a href="add_feedback.jsp" class="dropdown-item"> Add Feedback </a>
                        <a href="search_feedback.jsp" class="dropdown-item">Manage Feedback</a>
                       
                    </div>
                </div>
                 <a href="home1.jsp" class="nav-item nav-link">lOGOUT</a>
               
                </div>
                <a href="#" class="nav-item nav-link">Contact</a>
            </div>
            <div class="d-none d-lg-flex align-items-center ps-4">
                <i class="fa fa-2x fa-mobile-alt text-secondary me-3"></i>
                <div>
                    <h5 class="text-primary mb-1"><small>Call Now</small></h5>
                    <h6 class="text-light m-0">+012 345 6789</h6>
                </div>
            </div>
         
    </nav>
    <!-- Navbar End -->



    <!-- Hero Start -->
    <div class="container-fluid bg-primary py-5 bg-hero" style="margin-bottom: 90px;">
        <div class="container py-5">
            <div class="row justify-content-start">
                <div class="col-lg-8 text-center text-lg-start">
                    <h1 class="display-1 text-light">We Bring Your Home To Lively Colors</h1>
                    <p class="fs-4 text-light mb-4">Nonumy diam dolores est ipsum diam amet lorem clita clita sit eirmod duo clita dolore dolor ut diam diam justo sed est</p>
                    
                </div>
            </div>
        </div>
    </div>
    <!-- Hero End -->
 

   


    <!-- Quote Start -->
    <div class="container-fluid bg-primary bg-quote py-5" style="margin: 90px 0;">
        <div class="container py-5">
            <div class="row g-0 justify-content-start">
                <div class="col-lg-6">
                    <div class="bg-white text-center p-5">
                        <h1 class="mb-4">update feedback </h1>

	<%
		String id = request.getParameter("Id");
		String feed = request.getParameter("Feed");
		String email = request.getParameter("Email");
		String name = request.getParameter("Name");
		
		 
	%>
	
	<form action="update_feed" method="post">
		<label for="cid">feedback ID</label><br>
		<input type="text" name="ID" class="form-control bg-light border-0"  value="<%= id%>" readonly><br><br>
		<label for="name">feedback </label><br>
		<input type="text" name="feed" class="form-control bg-light border-0"  value="<%= feed%>"><br><br>
		<label for="password"> email  </label><br>
		<input type="text" name="email" class="form-control bg-light border-0"  value="<%= email%>"><br><br>
		<label for="phone">name</label><br>
		<input type="text" name="name" class="form-control bg-light border-0"  value="<%= name%>"><br><br>
		 
		 
		
		<input type="submit" class="btn btn-primary w-100 py-3" name="submit" value="Update">
  	</form> </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Quote End -->

 

 
 
 

    <!-- Footer Start -->
     
    <div class="container-fluid bg-primary text-dark py-4">
        <div class="container">
            <div class="row g-0">
                <div class="col-md-6 text-center text-md-start">
                    <p class="mb-md-0">Copyright &copy; <a class="text-dark fw-bold" href="#">CEYLON HOTEL RESERVATION</a>. All Rights Reserved.</p>
                </div>
                <div class="col-md-6 text-center text-md-end">
                    <p class="mb-0">Designed by <a class="text-dark fw-bold" href="https://htmlcodex.com">CEYLON HOTEL RESERVATION</a></p>
                </div>
            </div>
        </div>
    </div>
    <!-- Footer End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-secondary btn-lg-square rounded-circle back-to-top"><i class="bi bi-arrow-up"></i></a>


    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>
</html>