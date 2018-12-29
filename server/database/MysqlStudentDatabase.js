"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var MysqlDataSource_1 = require("./MysqlDataSource");
var MysqlStudentDatabase = /** @class */ (function (_super) {
    __extends(MysqlStudentDatabase, _super);
    function MysqlStudentDatabase() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    MysqlStudentDatabase.prototype.getAllStudents = function () {
        //get connection
        return [{
                fullname: 'joshua mshana',
                address: ' makumbusho',
                courses: {
                    id: 1,
                    lecture: 'muomi',
                    name: 'digital'
                },
                email: 'email@',
                id: 1
            },
            {
                fullname: 'joshua 2',
                address: ' makumbusho',
                courses: {
                    id: 1,
                    lecture: 'muomi',
                    name: 'digital'
                },
                email: 'email@',
                id: 1
            }];
    };
    MysqlStudentDatabase.prototype.getStudent = function (id) {
        return {
            fullname: 'joshua mshana',
            address: ' makumbusho',
            courses: {
                id: 1,
                lecture: 'muomi',
                name: 'digital'
            },
            email: 'email@',
            id: 1
        };
    };
    return MysqlStudentDatabase;
}(MysqlDataSource_1.MysqlDataSource));
exports.MysqlStudentDatabase = MysqlStudentDatabase;
