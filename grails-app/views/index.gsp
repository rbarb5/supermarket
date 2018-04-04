<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to SysArch Supermarket</title>
</head>
<body>

	<div id="content" role="main">
		<section class="row colset-2-its">
			<h1>Welcome to SysArch Supermarket</h1>
 	<p>
                Welcome to SysArch Supermarket, we hope you are satisfied with or new website. Please find your desired page using the links below.
            </p>

		<div class="container">
			<div class="row">
				<div class="col-md-2 classNav">
					<h2>Managers</h2>
					<button type="button" class="btn btn-default">
					<g:link controller="Manager" action="index">Manager Controller</g:link>
					</button>
				</div>

				<div class="col-md-2 classNav">
					<h2>TeamLeaders</h2>
					<button type="button" class="btn btn-default">
					<g:link controller="TeamLeader" action="index">TeamLeader Controller</g:link>
					</button>
				</div>

				<div class="col-md-2 classNav">
					<h2>Employee</h2>
					<button type="button" class="btn btn-default">
					<g:link controller="Employee" action="index">Employee Controller</g:link>
					</button>
				</div>

				<div class="col-md-2 classNav">
					<h2>Team</h2>
					<button type="button" class="btn btn-default">
					<g:link controller="Team" action="index">Team Controller</g:link>
					</button>
				</div>

				<div class="col-md-2 classNav">
					<h2>Task</h2>
					<button type="button" class="btn btn-default">
					<g:link controller="Task" action="index">Task Controller</g:link>
					</button>
				</div>

				<div class="col-md-2 classNav">
					<h2>Shift</h2>
					<button type="button" class="btn btn-default">
					<g:link controller="Shift" action="index">Shift Controller</g:link>
					</button>
				</div>
			</div>
		</div>
        </section>
    </div>

</body>
</html>
