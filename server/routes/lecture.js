const mysqlS = require('../database/MysqlStudentDatabase');
const app = require('express');
const router = app.Router();

router.get('/students', function (req, res, next) {
    res.send();
});

router.get('/postmarks', function (req, res, next) {
    let param = req.param('m');
    res.send('ypu input : ' + param)
});

module.exports = router;