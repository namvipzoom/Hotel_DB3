-- TẠO CƠ SỞ DỮ LIỆU
Create database hotel_DB3
go
use hotel_DB3
go

-- TẠO CÁC BẢNG

-- Bảng users
Create table Users
(
	maNguoiDung varchar(5) primary key,
	tenNguoiDung nvarchar(50) not null,
	matKhau nvarchar(50) not null,
	trangThai bit default(0) not null
)
go


-- Bảng danh mục, danh mục các loại phòng
Create table DanhMuc
(
	maDanhMuc int Primary key identity, --Mã danh mục phòng
	tenDanhMuc Nvarchar (100) Not null, --Tên danh mục phòng
	giaPhong float Not null, --Giá của loại phòng
	ghiChu nvarchar (255), --Ghi chú về danh mục
	trangThai Bit Default(0) not null --Trạng thái danh mục phòng, 0- hoạt động, 1- không hoạt động
)
go

-- Bảng nhân viên, thông tin nhân viên trực tiếp phục vụ khách hàng
Create table NhanVien
(
	maNhanVien Varchar (5) Primary key, --Mã nhân viên
	tenNhanVien Nvarchar (100) Not null, --Tên nhân viên
	dienThoai Varchar (20) Not null ,--Điện thoại của nhân viên
	gioiTinh bit Default(0) not null, --Giới tính của nhân viên
	ghiChu nvarchar (255), --Ghi chú về nhân viên
	trangThai Bit Default(0) not null --Trạng thái nhân viên, 0- đang làm việc, 1- đã nghỉ việc
)
go

-- Bảng khách hàng, thông tin khách hàng đặt phòng
Create table KhachHang
(
	maKhachHang int Primary key identity, --Mã khách hàng
	tenKhachHang Nvarchar (100) Not null, --Tên khách hàng
	dienThoai Varchar (20) Not null, --Điện thoại của khách hàng
	CMND Varchar (25) Not null, --Số chứng minh thư
	ghiChu nvarchar (255), --Ghi chú về khách hàng
	soLuot int Default(1) not null, --Số lượt khách tới khách sạn
	trangThai Bit Default(0) not null --Trạng thái khách hàng, 0- đang thuê, 1- chưa thuê
)
go

-- Bảng phòng, thông tin cơ bản về phòng
Create table Phong
(
	maPhong int Primary key identity, --Mã phòng
	tenPhong Nvarchar (100) Not null, --Tên phòng
	loaiPhong int Foreign key references DanhMuc(maDanhMuc), --Loại phòng liên kết khóa ngoại tới trường maDanhMuc của bảng DanhMuc
	soGiuong int not null, -- Số giường trong 1 phòng
	ghiChu nvarchar (255), --Ghi chú
	trangThai bit Default(0) not null, --Trạng thái của phòng 0- còn trống, 1- đang ở
)
go

-- Bảng dịch vụ, thông tin của các dịch vụ đi kèm
Create table DichVu
(
	maDichVu int Primary key identity, --Mã dịch vụ
	tenDichVu Nvarchar (100) Not null, --Tên dịch vụ
	giaDichVu float Not null, --Giá dịch vụ
	trangThai Bit Default(0) not null --Trạng thái dịch vụ, 0-phục vụ, 1- không phục vụ
)
go

--Bảng thiết bị, Thông tin các thiết bị của khách sạn
create table ThietBi
(
maThietBi int Primary key identity,--Mã thiết bị
tenThietBi Nvarchar(100) Not null,--Tên thiết bị   
giaThietBi float Not null,--Giá thiết bị
soLuong	int	Not null,--Số lượng thiết bị
trangThai Bit Default(0) not null,--Trạng thái về thiết bị
)
go

-- Bảng khuyến mại, thông tin của các khuyến mại tặng kèm được áp dụng cho hóa đơn của khách
Create table KhuyenMai
(
	maKhuyenMai int Primary key identity, --Mã khuyến mại
	tenKhuyenMai Nvarchar (100) Not null, --Tên khuyến mại
	noiDung Nvarchar (255), --Nội dung khuyến mại
	giaTri float Default(0) not null, --Giá trị của chương trình khuyến mại
	loaiKhuyenMai int Not null, --Loại khuyến mại
	trangThai Bit Default(0) not null --Trạng thái của khuyến mại, 0-phục vụ, 1- không phục vụ
)
go

-- Bảng hóa đơn, thông tin của hóa đơn mà khách đặt, bao gồm nhiều phiếu thanh toán thuê phòng và phiếu dịch vụ
Create table HoaDon
(
	maHoaDon int Primary key identity, --Mã hóa đơn của khách hàng
	maNhanVien Varchar (5) Foreign key references NhanVien(maNhanVien), --Mã nhân viên trực tiếp đặt phòng cho khách
	maKhachHang int Foreign key references KhachHang(maKhachHang), --Mã của khách hàng
	maPhong int foreign key references Phong(maPhong), -- Mã phòng mà khách hàng thuê 
	ngayDen	date Not null,--Ngày khách hàng tới khách sạn
	ngayDi	date Not null,--Ngày khách hàng rời khách sạn
	datCoc float Default(0) not null, --Tiền đặt cọc của khách
	maKhuyenMai int Foreign key references KhuyenMai(maKhuyenMai), --Mã khuyến mại tặng kèm khách hàng
	tongTien float Not null, --Tổng tiền thanh toán của khách hàng là tổng tiền của các phiếu đặt phòng
	ghiChu nvarchar (255), --Ghi chú về phòng
	trangThai Bit Default(0) not null --Trạng thái hóa đơn, 0- đã thanh tóa, 1- đang chờ
)
go

-- Bảng phiếu thiết bị, Thông tin thiết bị của phòng
create table PhieuThietBi
(
maDanhMuc int Foreign key references DanhMuc(maDanhMuc),--Mã phòng
maThietBi int Foreign key references ThietBi(maThietBi),--Mã thiết bị
soLuong	int	Not null,--Số lượng thiết bị
ghiChu nvarchar(255),--Ghi chú về phiếu thiết bị
trangThai Bit Default(0) not null,--Trạng thái của thiết bị
)
go

-- Bảng phiếu dịch vụ, thông tin chi tiết về các dịch vụ khách đặt
Create table PhieuDichVu
(
	maDichVu int Foreign key references DichVu(maDichVu), --Mã dịch vụ của phòng
	maPhong int Foreign key references Phong (maPhong), --Mã phòng mà khách hàng thuê
	ghiChu nvarchar (255), --Ghi chú về phiếu đặt
	trangThai Bit Default(0) not null --Trạng thái của khuyến mại, 0- đã thanh toán, 1- đang chờ
)
go




