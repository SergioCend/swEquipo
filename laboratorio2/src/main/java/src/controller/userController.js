    App.Controller.UserController = Backbone.View.extend({
        el: '#main',
        initialize: function(options) {
            this.editTemplate = _.template($('#user').html());
			
            var self = this;
            Backbone.on('user-create', function(params) {
                self.create(params);
            });
            Backbone.on('user-save', function(params) {
                self.save(params);
            });
            Backbone.on('user-cancel', function(params) {
                self.cancel(params);
            });
			Backbone.on('user-p', function(params) {
                self.p(params);
            });
        },
        create: function() {
            this.userModel = new App.Model.UserModel();
            this._renderEdit();
        },
        save:function() { 
            var model = $('#userForm').serializeObject();
            alert('saved model: '+JSON.stringify(model));
        },
        cancel: function(){
            alert('Cancel');
        },
		p: function(){
            this.userModel = new App.Model.UserModel();
            this.a();
        },
        _renderEdit: function() {
            var self = this;
            self.$el.html(self.editTemplate({user: self.userModel}));
        },
		
		a: function() {
			this.userModel = new App.Model.UserModel();		
			var model = $('#userForm').serializeObject();    
			
			var texto=JSON.stringify(model); 
		    document.writeln("Los datos ingresados son:");
			document.writeln(texto);	
			this.userModel = new App.Model.UserModel();
			this._renderEdit();
			
			
		
        }
    });