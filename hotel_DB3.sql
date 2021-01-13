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
maPhong int, -- Mã phòng
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



-- Thủ tục của bảng Danh mục
-- Thêm mới dữ liệu
Create proc add_DanhMuc
@tenDanhMuc Nvarchar (100) , --Tên danh mục phòng
@giaPhong float , --Giá của loại phòng
@ghiChu nvarchar (255), --Ghi chú về danh mục
@trangThai Bit  --Trạng thái danh mục phòng
as
BEGIN 
	insert into DanhMuc values(@tenDanhMuc,@giaPhong,@ghiChu,@trangThai)
END
go

Create proc update_DanhMuc
@maDanhMuc int , --Mã danh mục phòng
@tenDanhMuc Nvarchar (100), --Tên danh mục phòng
@giaPhong float, --Giá của loại phòng
@ghiChu nvarchar (255), --Ghi chú về danh mục
@trangThai Bit  --Trạng thái danh mục phòng
as
BEGIN
	update DanhMuc set tenDanhMuc = @tenDanhMuc, giaPhong = @giaPhong, ghiChu = @ghiChu, trangThai = @trangThai where maDanhMuc = @maDanhMuc
END
go

Create proc delete_DanhMuc
@maDanhMuc int  --Mã danh mục phòng
as
BEGIN
	delete from DanhMuc where maDanhMuc = @maDanhMuc
END
go

Create proc getAll_DanhMuc
as
BEGIN
	select * from DanhMuc
END
go

Create proc find_maDanhMuc
@maDanhMuc int
as
BEGIN
	select * from DanhMuc where maDanhMuc = @maDanhMuc
END
go
Create proc getAll_DanhMucHoatDong
as
BEGIN
	select * from DanhMuc where trangThai = 1
END
go

-- Thủ tục của bảng Nhân Viên
Create proc add_NhanVien
@maNhanVien Varchar (5) , --Mã nhân viên
@tenNhanVien Nvarchar (100) , --Tên nhân viên
@dienThoai Varchar (20) ,--Điện thoại của nhân viên
@gioiTinh bit, --Giới tính của nhân viên
@ghiChu nvarchar (255), --Ghi chú về nhân viên
@trangThai Bit  --Trạng thái nhân viên
as
BEGIN
	insert into NhanVien values (@maNhanVien,@tenNhanVien,@dienThoai,@gioiTinh,@ghiChu,@trangThai)
END
go

Create proc update_NhanVien
@maNhanVien Varchar (5) , --Mã nhân viên
@tenNhanVien Nvarchar (100) , --Tên nhân viên
@dienThoai Varchar (20) ,--Điện thoại của nhân viên
@gioiTinh bit, --Giới tính của nhân viên
@ghiChu nvarchar (255), --Ghi chú về nhân viên
@trangThai Bit  --Trạng thái nhân viên
as
BEGIN
	update NhanVien set tenNhanVien = @tenNhanVien, dienThoai = @dienThoai,gioiTinh = @gioiTinh,ghiChu = @ghiChu,trangThai = @trangThai where maNhanVien = @maNhanVien
END
go

Create proc delete_NhanVien
@maNhanVien varchar(5)
as
BEGIN
	delete from NhanVien where maNhanVien = @maNhanVien
END
go

Create proc getAll_NhanVien
as
BEGIN
	select * from NhanVien
END	
go

Create proc find_maNhanVien
@maNhanVien varchar(5)
as
BEGIN
	select * from NhanVien where maNhanVien = @maNhanVien
END
go

Create proc find_tenNhanVien
@tenNhanVien varchar(100)
as
BEGIN 
	select * from NhanVien where tenNhanVien like '%'+@tenNhanVien+'%'
END
go



-- THỦ TỤC BẢNG KHÁCH HÀNG
Create proc add_KhachHang
@tenKhachHang Nvarchar (100) , --Tên khách hàng
@dienThoai Varchar (20) , --Điện thoại của khách hàng
@CMND Varchar (25) , --Số chứng minh thư
@ghiChu nvarchar (255), --Ghi chú về khách hàng
@soLuot int, --Số lượt khách tới khách sạn
@trangThai Bit  --Trạng thái khách hàng
as
BEGIN
	insert into KhachHang values(@tenKhachHang,@dienThoai,@CMND,@ghiChu,@soLuot,@trangThai)
END
go

Create proc update_KhachHang
@maKhachHang int , --Mã khách hàng
@tenKhachHang Nvarchar (100) , --Tên khách hàng
@dienThoai Varchar (20) , --Điện thoại của khách hàng
@CMND Varchar (25) , --Số chứng minh thư
@ghiChu nvarchar (255), --Ghi chú về khách hàng
@soLuot int, --Số lượt khách tới khách sạn
@trangThai Bit  --Trạng thái khách hàng
as
BEGIN
	update KhachHang set tenKhachHang = @tenKhachHang, dienThoai = @dienThoai,CMND=@CMND, ghiChu=@ghiChu,soLuot = @soLuot,trangThai = @trangThai where maKhachHang = @maKhachHang
END
go



Create proc delete_KhachHang
@makhachHang int
as
BEGIN
	delete from KhachHang where maKhachHang = @makhachHang
END
go

Create proc getAll_KhachHang
as
BEGIN
	select * from KhachHang
END
go



Create proc find_maKhachHang
@maKhachHang int
as
BEGIN
	select * from KhachHang where maKhachHang = @maKhachHang
END
go

Create proc find_tenKhachHang
@tenKhachHang varchar(100)
as
BEGIN
	select * from KhachHang where tenKhachHang like '%'+@tenKhachHang+'%'
END
go

create proc find_CMND_SDT
	@input varchar(100)
as
begin
	select * from KhachHang where CMND = @input or dienThoai = @input
end
go
 


--THỦ TỤC BẢNG PHÒNG
Create proc add_Phong
@tenPhong Nvarchar (100), --Tên phòng
@loaiPhong int , --Loại phòng liên kết khóa ngoại tới trường maDanhMuc của bảng DanhMuc
@soGiuong int , -- Số giường trong 1 phòng
@ghiChu nvarchar (255), --Ghi chú
@trangThai bit  --Trạng thái của phòng 0- còn trống, 1- đang ở
as
BEGIN
	insert into Phong values(@tenPhong,@loaiPhong,@soGiuong,@ghiChu,@trangThai)
END
go

Create proc update_Phong
@maPhong int, --Mã phòng
@tenPhong Nvarchar (100), --Tên phòng
@loaiPhong int , --Loại phòng liên kết khóa ngoại tới trường maDanhMuc của bảng DanhMuc
@soGiuong int , -- Số giường trong 1 phòng
@ghiChu nvarchar (255), --Ghi chú
@trangThai bit  --Trạng thái của phòng 0- còn trống, 1- đang ở
as
BEGIN
	update Phong set tenPhong = @tenPhong, loaiPhong = @loaiPhong,soGiuong=@soGiuong,ghiChu=@ghiChu,trangThai=@trangThai where maPhong = @maPhong
END
go

Create proc delete_Phong
@maPhong int
as
BEGIN
	delete from Phong where maPhong = @maPhong
END
go

Create proc getAll_Phong
as
BEGIN
	select p.*, dm.tenDanhMuc  from Phong p
	join DanhMuc dm on p.loaiPhong = dm.maDanhMuc
END
go

create proc find_maPhong
@maPhong int
as
BEGIN
	select * from Phong where maPhong = @maPhong
END
go

Create proc find_tenPhong
@tenPhong varchar(100)
as
BEGIN 
	select p.*, dm.tenDanhMuc  from Phong p
	join DanhMuc dm on p.loaiPhong = dm.maDanhMuc 
	where tenPhong like '%'+@tenPhong+'%'
END
go



-- THỦ TỤC BẢNG DỊCH VỤ
Create proc add_DichVu
@tenDichVu Nvarchar (100) , --Tên dịch vụ
@giaDichVu float , --Giá dịch vụ
@trangThai Bit  --Trạng thái dịch vụ, 0-phục vụ, 1- không phục vụ
as
BEGIN
	insert into DichVu values(@tenDichVu,@giaDichVu,@trangThai)
END
go

Create proc update_DichVu
@maDichVu int, --Mã dịch vụ
@tenDichVu Nvarchar (100) , --Tên dịch vụ
@giaDichVu float , --Giá dịch vụ
@trangThai Bit  --Trạng thái dịch vụ, 0-phục vụ, 1- không phục vụ
as
BEGIN
	update DichVu set tenDichVu = @tenDichVu, giaDichVu = @giaDichVu, trangThai = @trangThai where maDichVu = @maDichVu
END
go

Create proc delete_DichVu
@maDichVu int
as
BEGIN
	delete from DichVu where maDichVu = @maDichVu
END
go

Create proc getAll_DichVu
as
BEGIN
	select * from DichVu
END
go

Create proc find_maDichVu
@maDichVu int
as
BEGIN
	select * from DichVu where maDichVu = @maDichVu
END
go

Create proc find_tenDichVu
@tenDichVu varchar(100)
as
BEGIN
	select * from DichVu where tenDichVu like '%'+@tenDichVu+'%'
END
go



-- THỦ TỤC BẢNG THIẾT BỊ
Create proc add_ThietBi
@tenThietBi Nvarchar(100),--Tên thiết bị   
@giaThietBi float,--Giá thiết bị
@soLuong int,--Số lượng thiết bị
@trangThai Bit --Trạng thái về thiết bị
as
BEGIN
	insert into ThietBi values(@tenThietBi,@giaThietBi,@soLuong,@trangThai)
END
go

Create proc update_ThietBi
@maThietBi int ,--Mã thiết bị
@tenThietBi Nvarchar(100),--Tên thiết bị   
@giaThietBi float,--Giá thiết bị
@soLuong int,--Số lượng thiết bị
@trangThai Bit --Trạng thái về thiết bị
as
BEGIN
	update ThietBi set tenThietBi = @tenThietBi, giaThietBi = @giaThietBi,soLuong = @soLuong,trangThai = @trangThai where maThietBi = @maThietBi
END
go

Create proc delete_ThietBi
@maThietBi int
as
BEGIN
	delete from  ThietBi where maThietBi = @maThietBi
END
go

Create proc getAll_ThietBi
as
BEGIN
	select * from ThietBi
END
go

Create proc find_maThietBi
@maThietBi int
as
BEGIN
	select * from ThietBi where maThietBi = @maThietBi
END
go

Create proc find_tenThietBi
@tenThietBi varchar(100)
as
BEGIN
	select * from ThietBi where tenThietBi like '%'+@tenThietBi+'%'
END
go

Create proc get_maThietBy
@tenThietBi varchar(100)
as
BEGIN
	select maThietBi from ThietBi where tenThietBi = @tenThietBi
END
go


--THỦ TỤC BẢNG KHUYẾN MẠI
Create proc add_KhuyenMai
@tenKhuyenMai Nvarchar (100) , --Tên khuyến mại
@noiDung Nvarchar (255), --Nội dung khuyến mại
@giaTri float , --Giá trị của chương trình khuyến mại
@trangThai Bit  --Trạng thái của khuyến mại, 0-phục vụ, 1- không phục vụ
as
BEGIN
	insert into KhuyenMai values(@tenKhuyenMai,@noiDung,@giaTri,@trangThai)
END
go

Create proc update_KhuyenMai
@maKhuyenMai int , --Mã khuyến mại
@tenKhuyenMai Nvarchar (100) , --Tên khuyến mại
@noiDung Nvarchar (255), --Nội dung khuyến mại
@giaTri float , --Giá trị của chương trình khuyến mại
@trangThai Bit  --Trạng thái của khuyến mại, 0-phục vụ, 1- không phục vụ
as
BEGIN
	update KhuyenMai set tenKhuyenMai = @tenKhuyenMai, noiDung = @noiDung, giaTri = @giaTri, trangThai = @trangThai 
	where maKhuyenMai = @maKhuyenMai
END
go

Create proc delete_KhuyenMai
@maKhuyenMai int
as
BEGIN
	delete from KhuyenMai where maKhuyenMai = @maKhuyenMai
END
go

Create proc getAll_KhuyenMai
as
BEGIN
	select * from KhuyenMai
END
go

Create proc find_maKhuyenMai
@maKhuyenMai int
as
BEGIN
	select * from KhuyenMai where maKhuyenMai = @maKhuyenMai
END
go

Create proc find_tenKhuyenMai
@tenKhuyenMai varchar(100)
as
BEGIN
	select * from KhuyenMai where tenKhuyenMai like  '%'+@tenKhuyenMai+'%'
END
go



-- THỦ TỤC BẢNG HÓA ĐƠN
Create proc add_HoaDon
@maNhanVien Varchar (5) , --Mã nhân viên trực tiếp đặt phòng cho khách
@maKhachHang int , --Mã của khách hàng
@maPhong int , -- Mã phòng mà khách hàng thuê 
@ngayDen	date ,--Ngày khách hàng tới khách sạn
@ngayDi	date ,--Ngày khách hàng rời khách sạn
@datCoc float , --Tiền đặt cọc của khách
@maKhuyenMai int , --Mã khuyến mại tặng kèm khách hàng
@tongTien float , --Tổng tiền thanh toán của khách hàng là tổng tiền của các phiếu đặt phòng
@ghiChu nvarchar (255), --Ghi chú về phòng
@trangThai Bit  --Trạng thái hóa đơn, 0- đã thanh tóa, 1- đang chờ
as
BEGIN
	insert into HoaDon values(@maNhanVien,@maKhachHang,@maPhong,@ngayDen,@ngayDi,@datCoc,@maKhuyenMai,@tongTien,@ghiChu,@trangThai)
END
go

Create proc update_HoaDon
@maHoaDon int , --Mã hóa đơn của khách hàng
@maNhanVien Varchar (5) , --Mã nhân viên trực tiếp đặt phòng cho khách
@maKhachHang int , --Mã của khách hàng
@maPhong int , -- Mã phòng mà khách hàng thuê 
@ngayDen	date ,--Ngày khách hàng tới khách sạn
@ngayDi	date ,--Ngày khách hàng rời khách sạn
@datCoc float , --Tiền đặt cọc của khách
@maKhuyenMai int , --Mã khuyến mại tặng kèm khách hàng
@tongTien float , --Tổng tiền thanh toán của khách hàng là tổng tiền của các phiếu đặt phòng
@ghiChu nvarchar (255), --Ghi chú về phòng
@trangThai Bit  --Trạng thái hóa đơn, 0- đã thanh tóa, 1- đang chờ
as
BEGIN
	update HoaDon set maNhanVien = @maNhanVien, maKhachHang = @maKhachHang,maPhong = @maPhong,ngayDen = @ngayDen,ngayDi = @ngayDi,datCoc = @datCoc,
	maKhuyenMai = @maKhuyenMai,tongTien = @tongTien,ghiChu = @ghiChu,trangThai=@trangThai where maHoaDon = @maHoaDon
END
go

Create proc delete_HoaDon
@maHoaDon int  --Mã hóa đơn của khách hàng
as
BEGIN
	delete from HoaDon where maHoaDon = @maHoaDon
END
go

Create proc getAll_HoaDon
as
BEGIN
	select * from HoaDon
END
go

Create proc Find_maHoaDon
@maHoaDon int  --Mã hóa đơn của khách hàng
as
BEGIN
	select * from HoaDon where maHoaDon = @maHoaDon
END
go

Create proc find_HoaDonBy_MaKhachHang
@maKhachHang int
as
BEGIN
	select * from HoaDon where maKhachHang = @maKhachHang
END
go


--THỦ TỤC BẢNG THIẾT BỊ
Create proc add_PhieuThietBi
	@maDanhMuc int,--Mã phòng
	@maPhong int, -- Mã phòng
	@maThietBi int ,--Mã thiết bị
	@soLuong	int,--Số lượng thiết bị
	@ghiChu nvarchar(255),--Ghi chú về phiếu thiết bị
	@trangThai Bit--Trạng thái của thiết bị
as
BEGIN
	-- if((select soLuong from ThietBi)>=@soLuong and (select maThietBi from PhieuThietBi)!=@maThietBi)
	
		insert into PhieuThietBi values (@maDanhMuc, @maPhong, @maThietBi,@soLuong,@ghiChu,@trangThai);
		update ThietBi set soLuong = soLuong-@soLuong  where maThietBi = @maThietBi
	
	
END
go



create proc get_AllPhieuThietBi
as
begin
	select ptb.*, dm.tenDanhMuc as N'tenDanhMuc', tb.tenThietBi as N'tenThietBi' from PhieuThietBi ptb join ThietBi tb on tb.maThietBi = ptb.maThietBi join DanhMuc dm on dm.maDanhMuc = ptb.maDanhMuc
end
go


create proc delete_PhieuThietBi
	@maThietBi int --Mã thiết bị
as
BEGIN
	Delete from PhieuThietBi where maThietBi = @maThietBi; 
ENd
go

create proc find_PhieuThietBiByTen
	@tenThietBi nvarchar(50) -- Tên thiết bị	
as
BEGIN
	select ptb.*, dm.tenDanhMuc as N'tenDanhMuc', tb.tenThietBi as N'tenThietBi' from PhieuThietBi ptb join ThietBi tb on tb.maThietBi = ptb.maThietBi join DanhMuc dm on dm.maDanhMuc = ptb.maDanhMuc where tb.tenThietBi like '%'+@tenThietBi+'%' or dm.tenDanhMuc like '%'+@tenThietBi+'%'
ENd
go


create proc find_PhieuThietBiByTenVaPhong
	@maThietBi int, -- Mã thiết bị
	@phong int -- Số phòng
as
BEGIN
	select ptb.*, dm.tenDanhMuc as N'tenDanhMuc', tb.tenThietBi as N'tenThietBi' from PhieuThietBi ptb join ThietBi tb on tb.maThietBi = ptb.maThietBi join DanhMuc dm on dm.maDanhMuc = ptb.maDanhMuc where ptb.maThietBi = @maThietBi and ptb.maPhong = @phong
ENd
go
 
 -- Thủ tục bảng phiếu dịch vụ
Create proc add_PhieuDichVu
@maDichVu int , --Mã dịch vụ của phòng
@maPhong int , --Mã phòng mà khách hàng thuê
@ghiChu nvarchar (255), --Ghi chú về phiếu đặt
@trangThai Bit --Trạng thái của khuyến mại, 0- đã thanh toán, 1- đang chờ
as
BEGIN
	insert into PhieuDichVu values(@maDichVu,@maPhong,@ghiChu,@trangThai)
END
go

Create proc delete_PhieuDichVu
@maDichVu int  --Mã dịch vụ của phòng
as
BEGIN
	delete from PhieuDichVu where maDichVu = @maDichVu
END
go
Create proc getAll_PhieuDichVu
as
BEGIN
	select pdv.*,p.tenPhong,dv.giaDichVu,dv.tenDichVu from PhieuDichVu pdv join Phong p 
	on pdv.maPhong = p.maPhong
	join DichVu dv
	on pdv.maDichVu = dv.maDichVu
END


Create proc find_phieuDichVu
@maDichVu int
as
BEGIN
	select * from PhieuDichVu where maDichVu = @maDichVu
END
go
Create proc find_tenDichVu_PhieuDichVu
@tenDichVu nvarchar(100)
as
BEGIN
	select pdv.*,dv.tenDichVu,dv.giaDichVu,p.tenPhong from PhieuDichVu pdv join DichVu dv
	on pdv.maDichVu = dv.maDichVu 
	join phong p on pdv.maPhong = p.maPhong
	where dv.tenDichVu like '%'+@tenDichVu+'%'
END
go

 Create proc find_tenDanhMuc
@tenDanhMuc varchar(100)
as
BEGIN
	select * from DanhMuc where tenDanhMuc like  '%'+@tenDanhMuc+'%'
END
go

 --Thêm Danh Mục Phòng
exec add_DanhMuc 'Standar Single Bed Room',1000000,'',1
go
exec add_DanhMuc 'Standar Twin Bed Room',1500000,'',1	
go
exec add_DanhMuc 'Standar Double Bed Room',1500000,'',1	
go
exec add_DanhMuc 'Standar Tripple Bed Room',2000000,'',1
go
exec add_DanhMuc 'Superior Single Bed Room',2000000,'',1
go
exec add_DanhMuc 'Superior Twin Bed Room',2750000,'',1
go
exec add_DanhMuc 'Superior Double Bed Room',2750000,'',1
go
exec add_DanhMuc 'Superior Tripple Bed Room',3500000,'',1
go
exec add_DanhMuc 'Deluxe Single Bed Room',3000000,'',1
go
exec add_DanhMuc 'Deluxe Twin Bed Room',3750000,'',1
go
exec add_DanhMuc 'Deluxe Double Bed Room',3750000,'',1
go
exec add_DanhMuc 'Deluxe Tripple Bed Room',4250000,'',1
go
exec add_DanhMuc 'Suite Single Bed Room',4000000,'',1
go
exec add_DanhMuc 'Suite Twin Bed Room',5000000,'',1
go
exec add_DanhMuc 'Suite Double Bed Room',5000000,'',1
go
exec add_DanhMuc 'Suite Tripple Bed Room',5750000,'',1
go
exec add_DanhMuc 'Connecting Twin Bed Room',3500000,'',1
go
exec add_DanhMuc 'Connecting Double Bed Room',3500000,'',1
go
exec add_DanhMuc 'Connecting Tripple Bed Room',4000000,'',1
go


