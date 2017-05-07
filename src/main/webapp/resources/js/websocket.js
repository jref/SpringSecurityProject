(function ($) {
    var url = 'ws://' + window.location.host + '/websocket-message';
    var sock = new WebSocket(url);

    sock.onopen = function () {
        console.log('Opening web socket');
        sendMessage();
    };

    sock.onmessage = function (e) {
        console.log('Received message: ', e.data);
        setTimeout(function () {
            sendMessage()
        }, 2000);
    };

    sock.onclose = function () {
        console.log('Closing web socket');
    };

    function sendMessage() {
        console.log('Sending message: Hello!');
        sock.send("Hello!");
    }
})(jQuery);