import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewuserlistComponent } from './viewuserlist.component';

describe('ViewuserlistComponent', () => {
  let component: ViewuserlistComponent;
  let fixture: ComponentFixture<ViewuserlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewuserlistComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewuserlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
